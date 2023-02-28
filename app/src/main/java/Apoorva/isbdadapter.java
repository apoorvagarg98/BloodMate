package Apoorva;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class isbdadapter  extends ArrayAdapter<isbloodmodel> {


    public isbdadapter(@NonNull Context context, ArrayList<isbloodmodel> countryList) {
        super(context, 0,countryList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.isbdlistlyt, parent, false
            );
        }


        TextView textViewName = convertView.findViewById(R.id.isbdtext);

        isbloodmodel currentItem = getItem(position);

        if (currentItem != null) {

            textViewName.setText(currentItem.getblood());
        }

        return convertView;
    }

}
