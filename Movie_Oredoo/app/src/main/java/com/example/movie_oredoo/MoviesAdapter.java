package com.example.movie_oredoo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class MoviesAdapter extends BaseAdapter {

    Context ctx;
    ArrayList<Movies> movies;

    public MoviesAdapter(Context ctx,ArrayList<Movies> bestMovies) {
        this.ctx = ctx;
        this.movies= bestMovies;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int m) {
        return movies.get(m);
    }

    @Override
    public long getItemId(int m) {
        return m;
    }

    public static class ViewHolder{
        TextView durMov;
        ImageView imgMov;
        TextView titleMov;
    }

    @Override
    public View getView(int m, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view==null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_movies, null);
            holder.imgMov = view.findViewById(R.id.imgMovi);
            holder.titleMov = view.findViewById(R.id.text_mov_name);
            holder.durMov = view.findViewById(R.id.text_duration);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        holder.imgMov.setImageResource(movies.get(m).getImgResource());
        holder.imgMov.setScaleType(ImageView.ScaleType.FIT_CENTER);
        holder.titleMov.setText(movies.get(m).getMoviesName());
        holder.durMov.setText(movies.get(m).getDuration());

        return view;
    }

}
