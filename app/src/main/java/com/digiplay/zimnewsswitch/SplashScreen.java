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
        FancyWalkthroughCard fancywalkthroughCard1 = new FancyWalkthroughCard("Brandlook", "Lifestyle Magazine",R.mipmap.ic_launcher_round);

        FancyWalkthroughCard fancywalkthroughCard4 = new FancyWalkthroughCard("All your News in One Place", "Get the latest Local news, arts coverage and events happening around you.",R.mipmap.ic_launcher_round);

        fancywalkthroughCard1.setBackgroundColor(R.color.white);
        fancywalkthroughCard1.setIconLayoutParams(300,300,0,0,0,0);

        fancywalkthroughCard4.setBackgroundColor(R.color.white);
        fancywalkthroughCard4.setIconLayoutParams(300,300,0,0,0,0);
        List<FancyWalkthroughCard> pages = new ArrayList<>();

        pages.add(fancywalkthroughCard1);
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
