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

public class smokeadapter  extends ArrayAdapter<smokemodel> {

    public smokeadapter(@NonNull Context context, ArrayList<smokemodel> countryList) {
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
                    R.layout.smokelist, parent, false
            );
        }


        TextView textViewName = convertView.findViewById(R.id.smoketext);

        smokemodel currentItem = getItem(position);

        if (currentItem != null) {

            textViewName.setText(currentItem.getSmoke());
        }

        return convertView;
    }

}
