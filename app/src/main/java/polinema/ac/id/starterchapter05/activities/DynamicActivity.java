package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.BlueFragment;
import polinema.ac.id.starterchapter05.fragments.RedFragment;

public class DynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
    }

    public void handlerClickLoadRedFragment(View view) {
        Fragment fragmentTransaction = getSupportFragmentManager().findFragmentById(R.id.dynamic_fragment_placeholder);
        FragmentTransaction f = getSupportFragmentManager().beginTransaction();
        if(fragmentTransaction instanceof RedFragment){
            f.replace(R.id.dynamic_fragment_placeholder, new RedFragment() , "RED FRAGMENT");
            f.addToBackStack(null);
            f.commit();
        }
        else{
            f.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            f.replace(R.id.dynamic_fragment_placeholder, new RedFragment() , "RED FRAGMENT");
            f.addToBackStack(null);
            f.commit();
        }
    }

    public void handlerClickLoadBlueFragment(View view) {
        Fragment fragmentTransaction = getSupportFragmentManager().findFragmentById(R.id.dynamic_fragment_placeholder);
        FragmentTransaction f = getSupportFragmentManager().beginTransaction();
        if(fragmentTransaction instanceof BlueFragment) {
            f.replace(R.id.dynamic_fragment_placeholder, new BlueFragment(),  "BLUE FRAGMENT");
            f.addToBackStack(null);
            f.commit();
        }
        else{
            f.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
//            f.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            f.replace(R.id.dynamic_fragment_placeholder, new BlueFragment(),  "BLUE FRAGMENT");
            f.addToBackStack(null);
            f.commit();
        }
    }
}
