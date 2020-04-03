package jmac.application.chooseone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox icecreamCheckbox;
    private CheckBox chocolatecakeCheckBox;
    private CheckBox cookiesCheckbox;

    private Button showButton;
    private TextView showTextView;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        icecreamCheckbox = (CheckBox) findViewById ( R.id.icecreamId );
        chocolatecakeCheckBox = (CheckBox) findViewById ( R.id.chocolatecakeId );
        cookiesCheckbox =(CheckBox) findViewById ( R.id.cookiesId );

        showButton = (Button) findViewById ( R.id.showButtonId );

        showTextView = (TextView) findViewById ( R.id.resultId );
        showButton.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                StringBuilder stringBuilder = new StringBuilder (  );
                stringBuilder.append ( icecreamCheckbox.getText ().toString () + " status is: " + icecreamCheckbox.isChecked () + " \n " );
                stringBuilder.append ( chocolatecakeCheckBox.getText ().toString () + " status is: " + chocolatecakeCheckBox.isChecked () + " \n " );
                stringBuilder.append ( cookiesCheckbox.getText ().toString () + " status is: " + cookiesCheckbox.isChecked () + " \n " );

                showTextView.setText ( stringBuilder );
            }
        } );
    }
}
