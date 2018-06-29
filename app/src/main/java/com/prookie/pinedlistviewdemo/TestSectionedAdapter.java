package com.prookie.pinedlistviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TestSectionedAdapter extends SectionedBaseAdapter {

    private Context mContext;
    private List<String> groups;
    private Map<String, List<OpenHistory>> children;

    public TestSectionedAdapter(Context context, List<String> groups, Map<String, List<OpenHistory>> children) {
        mContext = context;
        this.groups = groups;
        this.children = children;
    }

    @Override
    public Object getItem(int section, int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int section, int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getSectionCount() {
        return groups.size();
    }

    @Override
    public int getCountForSection(int section) {
        return children.get(groups.get(section)).size();
    }

    @Override
    public View getItemView(int section, int position, View convertView, ViewGroup parent) {
        ItemViewHolder itemViewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_exlv_open_history_child, parent, false);
            itemViewHolder = new ItemViewHolder(convertView);
            convertView.setTag(itemViewHolder);
        } else {
            itemViewHolder = ((ItemViewHolder) convertView.getTag());
        }

        return convertView;
    }

    @Override
    public View getSectionHeaderView(int section, View convertView, ViewGroup parent) {
        SectionViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_exlv_open_history_group, parent, false);
            holder = new SectionViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = ((SectionViewHolder) convertView.getTag());
        }
        holder.tvTimeGroup.setText(groups.get(section));
        return convertView;
    }

    static class ItemViewHolder {
        @Bind(R.id.iv_open_type)
        ImageView ivOpenType;
        @Bind(R.id.tv_open_type)
        TextView tvOpenType;
        @Bind(R.id.tv_open_time)
        TextView tvOpenTime;

        ItemViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    static class SectionViewHolder {
        @Bind(R.id.tv_time_exlv_open_history_group)
        TextView tvTimeGroup;

        SectionViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
