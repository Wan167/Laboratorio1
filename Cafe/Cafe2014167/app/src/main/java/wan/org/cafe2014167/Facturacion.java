package wan.org.cafe2014167;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Facturacion extends AppCompatActivity {
    private TextView txtPedido2,txtTotal2;
    private Button BotonRe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facturacion);
        txtPedido2=(TextView)findViewById(R.id.txtPedido2);
        txtTotal2=(TextView) findViewById(R.id.txtTotal2);
        BotonRe=(Button)findViewById(R.id.BotonRe);
        Bundle bundle=this.getIntent().getExtras();
        txtPedido2.setText(bundle.getString("pedido").toString());
        Double total=Double.parseDouble(bundle.getString("pedido"))*7.50;
        txtTotal2.setText(total.toString());
        BotonRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Facturacion.this,principal.class));
            }
        });
    }
}
