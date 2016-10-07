package com.example.kim.breaktimeapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Kim on 2016-10-05.
 */

public class ImageAdapter extends BaseAdapter {

    private Context context;

    public Integer[] images = {
            R.drawable.movie_1, R.drawable.movie_2,
            R.drawable.movie_3, R.drawable.movie_4,
            R.drawable.movie_5, R.drawable.movie_6,
            R.drawable.movie_7, R.drawable.movie_8,
            R.drawable.movie_9, R.drawable.movie_10
    };

    public String[] titles = {
            "Despicable Me", "Inside Out",
            "Alvin and The ChipMunks", "Despicable Me2",
            "Monster University", "Turbo",
            "The Sponge Out Of Water", "Monster vs Aliens",
            "Koala Kid", "Over The Hedge"
    };

    public String[] names = {
            "Steve Carell", "Pete Docter & Ronnie Del Carmen",
            "Tim Hill", "Pierre Coffin",
            "Dan Scanlon","David Soren",
            "Tom Yasumi & Alan Smart", "Rob Letterman",
            "Kyung Ho Lee","Tim Johnson"
    };


    public String contents[] ={
        "When a criminal mastermind uses a trio of orphan girls as pawns for a grand scheme, he finds their love is profoundly changing him for the better.",
        "After young Riley is uprooted from her Midwest life and moved to San Francisco, her emotions - Joy, Fear, Anger, Disgust and Sadness - conflict on how best to navigate a new city, house, and school.",
        "A struggling songwriter named Dave Seville finds success when he comes across a trio of singing chipmunks: mischievous leader Alvin, brainy Simon, and chubby, impressionable Theodore.",
        "When Gru, the world's most super-bad turned super-dad has been recruited by a team of officials to stop lethal muscle and a host of Gru's own, He has to fight back with new gadgetry, cars, and more minion madness.",
        "A look at the relationship between Mike and Sulley during their days at Monsters University -- when they weren't necessarily the best of friends.",
        "A freak accident might just help an everyday garden snail achieve his biggest dream: winning the Indy 500.",
        "When a diabolical pirate above the sea steals the secret Krabby Patty formula, SpongeBob and his nemesis Plankton must team up in order to get it back.",
        "A woman transformed into a giant after she is struck by a meteorite on her wedding day becomes part of a team of monsters sent in by the U.S. government to defeat an alien mastermind trying to take over Earth.",
        "A white koala named Johnny is teased about his color so he joins a traveling circus with the help of Hamish...",
        "A scheming raccoon fools a mismatched family of forest creatures into helping him repay a debt of food, by invading the new suburban sprawl that popped up while they were hibernating...and learns a lesson about family himself."

    };

    public ImageAdapter(Context c){
        context = c;

    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgV = new ImageView(context);
        imgV.setImageResource(images[position]);
        imgV.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imgV.setLayoutParams(new GridView.LayoutParams(400, 400));
        return imgV;
    }
}
