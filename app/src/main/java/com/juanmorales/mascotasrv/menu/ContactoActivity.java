package com.juanmorales.mascotasrv.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.juanmorales.mascotasrv.R;
import com.juanmorales.mascotasrv.mail.SendMail;

public class ContactoActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtNombre;
    private EditText txtEmail;
    private EditText txtMensaje;
    private Button   btnEnviarMail;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        //Incluyendo la barra a cada activitie
        //Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        //setSupportActionBar(miActionBar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar = (Toolbar)findViewById(R.id.toolbar);

        txtNombre = (EditText)findViewById(R.id.txtNombre);
        txtEmail = (EditText)findViewById(R.id.txtEmail);
        txtMensaje = (EditText)findViewById(R.id.txtMensaje);
        btnEnviarMail = (Button)findViewById(R.id.btnEnviarMail);

        btnEnviarMail.setOnClickListener(this);

        if (toolbar != null){
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    private void sendEmail() {
        //Getting content for email
        String email = txtEmail.getText().toString().trim();
        String subject = txtNombre.getText().toString().trim();
        String message = txtMensaje.getText().toString().trim();

        //Creating SendMail object
        SendMail sm = new SendMail(this, email, subject, message);

        //Executing sendmail to send email
        sm.execute();
    }

    @Override
    public void onClick(View v) {
        sendEmail();
    }
}
