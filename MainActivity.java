package com.example.myapplication;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    int quantity1=0;

    public void submitOrder(View view) {
        quantity1++;
        display(quantity1);
    }
    public void submitOrder1(View view) {

        displayMenu();
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity);
        quantityTextView.setText("" + number);
    }}

    private void displayMenu() {
        TextView TextView = (TextView) findViewById(R.id.Menu);
        TextView.setText("1.Rajma 2.Chilli Paneer 3.Shahi Paneer 4Dal Makhani 5. Roti.");
    }}
