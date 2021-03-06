package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Prateek Garg on 10/15/2017.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private int mcolorResourceID = -1;
    //Constructor
    public WordAdapter(Activity context, ArrayList<Word> data){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, data);
    }
    public WordAdapter(Activity context, ArrayList<Word> data, int colorResource){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, data);
        mcolorResourceID = colorResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        //Get the Word at the position passed to the adapter
        Word currentWord = getItem(position);

        //Get the relevant text view by ID
        TextView miwokView = (TextView) listItemView.findViewById(R.id.miwok_word);
        TextView defaultView = (TextView) listItemView.findViewById(R.id.english_word);
        //Set the text to the relevant English and Miwok words here
        miwokView.setText(currentWord.getMiwokTranslation());
        defaultView.setText(currentWord.getDefaultTraslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        if (mcolorResourceID != -1) {
            //Set the color of the items same as the one in the menu:
            LinearLayout textSpace = (LinearLayout) listItemView.findViewById(R.id.text_space);
            textSpace.setBackgroundResource(mcolorResourceID);
            /*if (this.getContext().toString().contains("NumbersActivity")){
                textSpace.setBackgroundResource(R.color.category_numbers);
            }
            else if (this.getContext().toString().contains("ColorsActivity")){
                textSpace.setBackgroundResource(R.color.category_colors);
            }
            else if (this.getContext().toString().contains("FamilyActivity")){
                textSpace.setBackgroundResource(R.color.category_family);
            }
            else if (this.getContext().toString().contains("PhrasesActivity")){
                textSpace.setBackgroundResource(R.color.category_phrases);
            }*/
        }

        //return super.getView(position, convertView, parent);
        return listItemView;
    }
}
