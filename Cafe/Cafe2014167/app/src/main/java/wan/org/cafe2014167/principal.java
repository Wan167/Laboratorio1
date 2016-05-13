package wan.org.cafe2014167;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class principal extends AppCompatActivity {

    private EditText txtPedir;
    private Button pedir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtPedir=(EditText) findViewById(R.id.txtPedir);
        pedir=(Button) findViewById(R.id.pedir);
        pedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Snackbar.make(v,"Click en boton pedido",Snackbar.LENGTH_SHORT).show();
                Intent intent=new Intent(principal.this,Facturacion.class);
                intent.putExtra("pedido",txtPedir.getText().toString());
                startActivity(intent);
            }
        });
    }
}
