package com.example.shoppinglistappchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.shoppinglistappchallenge.databinding.ActivityListShoppingBinding;

public class ShoppingListActivity extends AppCompatActivity {
    public final static String ITEM_TAG = "id.ac.poliban.mi.va.sherli.shoppinglistappchallenge.EXTRA.ITEM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityShoppingListBinding shoppingListBinding = ActivityShoppingListBinding.inflate(getLayoutInflater());
        setContentView(shoppingListBinding.getRoot());

        Button[] mButton = new Button[]{
                shoppingListBinding.button,
                shoppingListBinding.button2,
                shoppingListBinding.button3,
                shoppingListBinding.button4,
                shoppingListBinding.button5,
                shoppingListBinding.button6,
        };

        for (Button button : mButton) {
            button.setOnClickListener(v -> {
                Button btn = (Button) v;

                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra(ITEM_TAG, btn.getText().toString());

                setResult(RESULT_OK, intent);
                finish();
            });
        }
    }