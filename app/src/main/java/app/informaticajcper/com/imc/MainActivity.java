package app.informaticajcper.com.imc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    Button button;
    EditText inputPeso;
    EditText inputAltura;
    TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
        inputAltura=(EditText)findViewById(R.id.input_altura);
        inputPeso=(EditText)findViewById(R.id.input_peso);
        result =(TextView)findViewById(R.id.result);
    }

    public void onClick(View v){
        //Comprobamos el tamaño del texto del EditText
        int peso=Integer.valueOf(inputPeso.getText().toString());
        int altura=Integer.valueOf(inputAltura.getText().toString());
        //Actualizamos el mensaje del TextView
        result.setText("IMC: "+ peso * altura);

    }

}
