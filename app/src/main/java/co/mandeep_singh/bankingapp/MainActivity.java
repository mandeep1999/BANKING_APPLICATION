package co.mandeep_singh.bankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        DatabaseHandler db = new DatabaseHandler(this);
//        db.addCustomer(new Customer("MANDY", "mandy@gmail.com", 5000.00));
//        db.addCustomer(new Customer("SANDY", "sandy@gmail.com", 6000.00));
//        db.addCustomer(new Customer("RANDY", "randy@gmail.com", 7000.00));
//        db.addCustomer(new Customer("CANDY", "candy@gmail.com", 8000.00));
//        db.addCustomer(new Customer("KANDY", "kandy@gmail.com", 9000.00));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),AllCustomers.class));
            }
        });
    }
}