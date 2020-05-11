package com.digiplay.zimnewsswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.shashank.sony.fancywalkthroughlib.FancyWalkthroughActivity;
import com.shashank.sony.fancywalkthroughlib.FancyWalkthroughCard;

import java.util.ArrayList;
import java.util.List;

public class SplashScreen extends FancyWalkthroughActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FancyWalkthroughCard fancywalkthroughCard1 = new FancyWalkthroughCard("The Chronicle News", "Bulawayo's most popular daily newspaper",R.drawable.logo);
        FancyWalkthroughCard fancywalkthroughCard2 = new FancyWalkthroughCard("The Herald News", "Zimbabwe's largest daily newspaper.",R.drawable.logo);
        FancyWalkthroughCard fancywalkthroughCard3 = new FancyWalkthroughCard("The Sunday Mail", "Bringing you the best",R.drawable.logo);
        FancyWalkthroughCard fancywalkthroughCard4 = new FancyWalkthroughCard("All your News in One Place", "Get the latest Local news.",R.drawable.logo);

        fancywalkthroughCard1.setBackgroundColor(R.color.white);
        fancywalkthroughCard1.setIconLayoutParams(300,300,0,0,0,0);
        fancywalkthroughCard2.setBackgroundColor(R.color.white);
        fancywalkthroughCard2.setIconLayoutParams(300,300,0,0,0,0);
        fancywalkthroughCard3.setBackgroundColor(R.color.white);
        fancywalkthroughCard3.setIconLayoutParams(300,300,0,0,0,0);
        fancywalkthroughCard4.setBackgroundColor(R.color.white);
        fancywalkthroughCard4.setIconLayoutParams(300,300,0,0,0,0);
        List<FancyWalkthroughCard> pages = new ArrayList<>();

        pages.add(fancywalkthroughCard1);
        pages.add(fancywalkthroughCard2);
        pages.add(fancywalkthroughCard3);
        pages.add(fancywalkthroughCard4);

        for (FancyWalkthroughCard page : pages) {
            page.setTitleColor(R.color.red);
            page.setDescriptionColor(R.color.black);
        }

        setFinishButtonTitle("Get Started");
        showNavigationControls(true);
        setColorBackground(R.color.red);
        setImageBackground(R.drawable.slider);
        setInactiveIndicatorColor(R.color.red);
        setActiveIndicatorColor(R.color.red);
        setOnboardPages(pages);

    }

    @Override
    public void onFinishButtonPressed() {
        Intent DriverIntent1 = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(DriverIntent1);


    }
}
