package chaoszelo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.administrator.yuying_android.R;
public class HomeActivity extends AppCompatActivity {

    //1.定义不同颜色的菜单项的标识:
    final private int RED = 110;
    final private int GREEN = 111;
    final private int BLACK= 116;
    private ImageButton button_control;
    private ImageButton button_yy;
    private ImageButton button_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("主页");

        this.button_control = (ImageButton) this.findViewById(R.id.controlButton);
        this.button_control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(HomeActivity.this, ControlActivity.class);
                startActivity(intent);
            }
        });
        this.button_yy = (ImageButton) this.findViewById(R.id.yyButton);
        this.button_yy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });  this.button_input = (ImageButton) this.findViewById(R.id.inputButton);
        this.button_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(HomeActivity.this, InputActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        menu.add(1,GREEN,2,"语音识别界面");
        menu.add(1,RED,4,"音量调节");
        menu.add(1,BLACK,7,"个人信息输入");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        Intent intent = new Intent();
        int id = item.getItemId();
        switch (id){
            case RED:
                intent.setClass(HomeActivity.this, ControlActivity.class);
                startActivity(intent);
                break;
            case GREEN:
                intent.setClass(HomeActivity.this, MainActivity.class);
                startActivity(intent);
                break;


            case BLACK:

                intent.setClass(HomeActivity.this, InputActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}