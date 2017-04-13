package com.ignaciojgp.charactersheet.Views;


import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.ignaciojgp.charactersheet.Characters.CharacterController;
import com.ignaciojgp.charactersheet.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GearFragment extends Fragment {


    public GearFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate( R.layout.text_layout,container,false );

        final EditText input = (EditText) v.findViewById( R.id.editText );
        input.setText(  CharacterController.getSelectedCharacter().gear );

        input.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                String stri = s.toString();
                CharacterController.getSelectedCharacter().gear = stri;
            }
        } );



        return v;
    }

}
