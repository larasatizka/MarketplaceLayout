package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class register_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_activity);
    }

    public void clickProfile(View view) {
        Intent intent = new Intent(this, profile_activity.class);
        startActivity(intent);

    }

    public void clickBackLogin(View view) {
        Intent intent = new Intent(this, login_activity.class);
        startActivity(intent);

    }
}
