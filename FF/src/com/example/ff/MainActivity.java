package com.example.ff;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	
	private TextView tv;
	private Button button;
	private CheckBox readingBox;
	private CheckBox watchingBox;
	private CheckBox AllBox;
	private RadioGroup radioGroup;
	private RadioButton femal;
	private RadioButton male;
	int count=0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tv=(TextView)findViewById(R.id.t1);
        readingBox=(CheckBox)findViewById(R.id.Readingcheckbox);
        watchingBox=(CheckBox)findViewById(R.id.watchingcheckbox);
        AllBox=(CheckBox)findViewById(R.id.allcheckbox);
		tv.setBackgroundColor(Color.BLUE);
		tv.setText("³ÂÇìÉ½");
		button=(Button)findViewById(R.id.b1);
		radioGroup=(RadioGroup)findViewById(R.id.RadioGroup);				
		buttonListen  bl= new buttonListen();
		button.setOnClickListener(bl);		
		checkboxLinstener  cbl= new checkboxLinstener();
		AllBox.setOnCheckedChangeListener(cbl);	
		radioGroup=(RadioGroup)findViewById(R.id.RadioGroup);
		femal=(RadioButton)findViewById(R.id.femal);
		male=(RadioButton)findViewById(R.id.male);
		
		radioLinsentener rLinsentener= new radioLinsentener();
		radioGroup.setOnCheckedChangeListener(rLinsentener);
    }
    
   
    class radioLinsentener implements android.widget.RadioGroup.OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup arg0, int checkid) {
			if (checkid==femal.getId()){
				System.out.println("female is seleted");
				
			}else{
				System.out.println("male is seleted");
				
			}
			
		}
    	
    	
    }

	
    
    
    class checkboxLinstener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(CompoundButton arg0, boolean ischecked) {
			if (ischecked){
				readingBox.setChecked(true);
				watchingBox.setChecked(true);
			}else{				
				readingBox.setChecked(false);
				watchingBox.setChecked(false);
			}
			
			
		}
    	
    }
    
    class buttonListen implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			count++;
			tv.setText(count+"");			
		}
	
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
