//atv 1:
// Felipe Jonck França
package com.example.geometriaespacialfelipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TelaContas extends AppCompatActivity {
    static int conta;
    EditText at, ab, n, f, h, v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_contas);
        at = findViewById(R.id.attext);
        ab = findViewById(R.id.abtext);
        n = findViewById(R.id.ntext);
        f = findViewById(R.id.ftext);
        h = findViewById(R.id.htext);
        v = findViewById(R.id.vtext);

        if(conta == 1){
            //At = 2*Ab+N*F
            at.setVisibility(View.GONE);
            h.setVisibility(View.GONE);
            v.setVisibility(View.GONE);
        }
        else if(conta == 2){
            //Ab = (At-N*F) / 2
            ab.setVisibility(View.GONE);
            h.setVisibility(View.GONE);
            v.setVisibility(View.GONE);
        }
        else if(conta == 3){
            //Ab = V / H
            ab.setVisibility(View.GONE);
            n.setVisibility(View.GONE);
            f.setVisibility(View.GONE);
            at.setVisibility(View.GONE);
        }
        else if(conta == 4){
            //N = (At-2*Ab) / F
            n.setVisibility(View.GONE);
            h.setVisibility(View.GONE);
            v.setVisibility(View.GONE);
        }
        else if(conta == 5){
            //V = Ab*H
            v.setVisibility(View.GONE);
            at.setVisibility(View.GONE);
            f.setVisibility(View.GONE);
            n.setVisibility(View.GONE);
        }
        else if(conta == 6){
            //H = V / Ab
            h.setVisibility(View.GONE);
            at.setVisibility(View.GONE);
            f.setVisibility(View.GONE);
            n.setVisibility(View.GONE);
        }
        else if(conta == 7){
            //F = (At-2*Ab) / N
            f.setVisibility(View.GONE);
            h.setVisibility(View.GONE);
            v.setVisibility(View.GONE);
        }


    }
    public void Contas(View a){
        int valorat = Integer.parseInt(String.valueOf(at));
        int valorab = Integer.parseInt(String.valueOf(ab));
        int valorn = Integer.parseInt(String.valueOf(n));
        int valorf = Integer.parseInt(String.valueOf(f));
        int valorh = Integer.parseInt(String.valueOf(h));
        int valorv = Integer.parseInt(String.valueOf(v));

        if(conta == 1){
            //At = 2*Ab+N*F
            Toast.makeText(getApplicationContext(), (2*valorab*valorn*valorf), Toast.LENGTH_SHORT).show();
        }
        else if(conta == 2){
            //Ab = (At-N*F) / 2
            Toast.makeText(getApplicationContext(), (valorat-valorn-valorf), Toast.LENGTH_SHORT).show();
        }
        else if(conta == 3){
            //Ab = V / H
            Toast.makeText(getApplicationContext(), (valorv/valorh), Toast.LENGTH_SHORT).show();
        }
        else if(conta == 4){
            //N = (At-2*Ab) / F
            Toast.makeText(getApplicationContext(), ((valorat-2*valorab)/valorf), Toast.LENGTH_SHORT).show();
        }
        else if(conta == 5){
            //V = Ab*H
            Toast.makeText(getApplicationContext(), (valorab*valorh), Toast.LENGTH_SHORT).show();
        }
        else if(conta == 6){
            //H = V / Ab
            Toast.makeText(getApplicationContext(), (valorv/valorab), Toast.LENGTH_SHORT).show();
        }
        else if(conta == 7){
            //F = (At-2*Ab) / N
            Toast.makeText(getApplicationContext(), ((valorat-2*valorab)/valorn), Toast.LENGTH_SHORT).show();
        }
    }

}

//------------------------------------------------------------------
