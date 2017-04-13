package com.ignaciojgp.charactersheet.Views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.ignaciojgp.charactersheet.Characters.CharacterController;
import com.ignaciojgp.charactersheet.Characters.CharacterDefinition;
import com.ignaciojgp.charactersheet.DTO.Class;
import com.ignaciojgp.charactersheet.DTO.Skill;
import com.ignaciojgp.charactersheet.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SkillsFragment extends Fragment {


    public SkillsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate( R.layout.fragment_list,container, false );

        RecyclerView recyclerView = (RecyclerView) v.findViewById( R.id.classRecicler );

        if(recyclerView != null){
            LinearLayoutManager manager = new LinearLayoutManager(getActivity() );
            recyclerView.setLayoutManager( manager );

            recyclerView.setAdapter( new skillCellAdapter() );
            recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),LinearLayoutManager.VERTICAL));

        }

        return v;
    }

    public class skillCellAdapter extends RecyclerView.Adapter<SkillsFragment.CellHolder>{

        @Override
        public CellHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.skill_cell_content, viewGroup, false);
            return new CellHolder(view);
        }

        @Override
        public void onBindViewHolder(final CellHolder viewHolder, int i) {

            CharacterDefinition.characterSkills sk = CharacterDefinition.characterSkills.values()[i];


            viewHolder.leftView.setText( getText( CharacterDefinition.skillTextMap.get( sk ) ) );
            viewHolder.skill = CharacterController.getSelectedCharacter().skillsValues.get( sk );
            viewHolder.rightView.setText( viewHolder.skill.points+" pts" );

            viewHolder.minus.setOnClickListener( new Button.OnClickListener(){
                public void onClick(View v) {
                    if(viewHolder.skill.points > 0)
                        viewHolder.skill.points --;
                    viewHolder.rightView.setText( viewHolder.skill.points+" pts" );

                }
            } );
            viewHolder.plus.setOnClickListener( new Button.OnClickListener(){
                public void onClick(View v) {
                    viewHolder.skill.points ++;
                    viewHolder.rightView.setText( viewHolder.skill.points+" pts" );

                }
            } );

        }

        @Override
        public int getItemCount() {
            return CharacterDefinition.characterSkills.values().length;
        }
    }


    public class CellHolder extends RecyclerView.ViewHolder{
        public final TextView leftView;
        public final TextView rightView;
        public final ImageButton plus;
        public final ImageButton minus;

        public Skill skill;
        public  CellHolder(View view){
            super(view);

            leftView = (TextView) view.findViewById( R.id.name );
            rightView = (TextView) view.findViewById( R.id.total );
            minus = (ImageButton) view.findViewById( R.id.minus );
            plus = (ImageButton) view.findViewById( R.id.plus );

        }

    }



}
