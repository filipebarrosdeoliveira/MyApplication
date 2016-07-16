package cc.inf.ufg.br.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void adicionarNumero(View view) {
        String numero = ((TextView) view).getText().toString();
        TextView resultado = ((TextView) findViewById(R.id.resultado));
        resultado.setText(resultado.getText() + numero);
    }

}


