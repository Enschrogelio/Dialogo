package www.ensch.dialogo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton= (Button) findViewById(R.id.button1);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        showDialog(0);
    }


    @Override
    protected Dialog onCreateDialog(int id){

        Dialog dialogo=null;
        if(id==0){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder=builder.setIcon(R.mipmap.ic_launcher);
            builder=builder.setTitle("así se ve un dialogo");
            dialogo=builder.create();
        }
        return dialogo;
    }
}