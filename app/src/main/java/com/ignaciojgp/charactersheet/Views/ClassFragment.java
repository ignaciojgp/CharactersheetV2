package com.ignaciojgp.charactersheet.Views;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ignaciojgp.charactersheet.Characters.CharacterController;
import com.ignaciojgp.charactersheet.DTO.Class;
import com.ignaciojgp.charactersheet.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ClassFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ClassFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ClassFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public ClassFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View  v= inflater.inflate( R.layout.fragment_list, container, false );
        RecyclerView list = (RecyclerView) v.findViewById( R.id.classRecicler );
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        if(list != null){
            list.setLayoutManager(layoutManager);
            list.setAdapter( new classCellAdapter() );
            list.addItemDecoration(new DividerItemDecoration(getActivity(),LinearLayoutManager.VERTICAL));

        }

        return v;
    }


    public class classCellAdapter extends RecyclerView.Adapter<ClassFragment.ViewHolder>{

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.character_list_content, viewGroup, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, int i) {

            Class c = CharacterController.getSelectedCharacter().classes.get( i );
            viewHolder.leftView.setText( c.name );
            viewHolder.rightView.setText( c.level+"" );

        }

        @Override
        public int getItemCount() {
            return CharacterController.getSelectedCharacter().classes.size();
        }
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView leftView;
        public final TextView rightView;


        public ViewHolder(View view) {
            super(view);
            mView = view;
            leftView = (TextView) view.findViewById(R.id.id);
            rightView = (TextView) view.findViewById(R.id.content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + rightView.getText() + "'";
        }
    }
}
