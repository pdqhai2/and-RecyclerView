package com.example.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.modle.Character;

import java.util.List;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder> {

    private Context context;
    private List<Character> mListChar2;

    public CharacterAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<Character> list)
    {
        this.mListChar2 = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_char,parent,false);
        return new CharacterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        Character chars = mListChar2.get(position);
        if(chars == null) {
            return;
        }
        holder.imgChar.setImageResource(chars.getResourceId());
        holder.tvcharName.setText(chars.getCharName());
    }

    @Override
    public int getItemCount() {
        if (mListChar2 != null )
        {
            return mListChar2.size();
        }
        return 0;
    }

    class CharacterViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgChar;
        private TextView tvcharName;

        public CharacterViewHolder(@NonNull View itemView) {
            super(itemView);
            imgChar = itemView.findViewById(R.id.img);
            tvcharName = itemView.findViewById(R.id.tv_charName);
        }
    }
}
