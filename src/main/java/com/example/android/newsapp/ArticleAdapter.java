package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ArticleAdapter extends ArrayAdapter<Article> {

    public ArticleAdapter(Context context, List<Article> articles) {
        super(context, 0, articles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.article_list_item, parent, false);
        }

        Article currentArticle = getItem(position);

        TextView textView = (TextView) listItemView.findViewById(R.id.title);
        textView.setText(currentArticle.getTitle());

        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        sectionView.setText(currentArticle.getSectionName());

        TextView name=(TextView)listItemView.findViewById(R.id.author);
        List<String> author = currentArticle.getAuthorName();
        if(!author.isEmpty()){
            StringBuilder output = new StringBuilder();
            for(int i = 0; i<author.size();i++){
                String all_author_names = author.get(i);
                output.append(all_author_names);
                output.append(" & ");
            }
            output.deleteCharAt(output.length()-2);
            name.setText(output);
        }
        else{
            name.setVisibility(View.GONE);
        }

        String date=currentArticle.getPublicationDateTime();
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        String Date = date.substring(0,10);
        dateView.setText(Date);


        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        String Time = date.substring(11,16);
        timeView.setText(Time);


        return listItemView;
    }


}