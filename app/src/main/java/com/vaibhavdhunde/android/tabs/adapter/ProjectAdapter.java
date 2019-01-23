package com.vaibhavdhunde.android.tabs.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vaibhavdhunde.android.tabs.R;
import com.vaibhavdhunde.android.tabs.model.Project;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder> {

    private List<Project> mProjects;

    public ProjectAdapter(List<Project> projects) {
        mProjects = projects;
    }

    public class ProjectViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.text_title)
        TextView mTextTitle;

        @BindView(R.id.text_description)
        TextView mTextDescription;

        @BindView(R.id.text_status)
        TextView mTextStatus;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View projectItemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_project, parent, false);
        return new ProjectViewHolder(projectItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder projectViewHolder, int position) {
        Project currentProject = mProjects.get(position);

        projectViewHolder.mTextTitle.setText(currentProject.getTitle());
        projectViewHolder.mTextDescription.setText(currentProject.getDescription());

        String stringStatus = "In Progress";
        int statusDrawableResourceId = R.drawable.project_status_in_progress_bg;
        int status = currentProject.getStatus();
        switch (status) {
            case 2:
                stringStatus = "Stagnated";
                statusDrawableResourceId = R.drawable.project_status_stagnated_bg;
                break;
            case 3:
                stringStatus = "Stopped";
                statusDrawableResourceId = R.drawable.project_status_stopped_bg;
                break;
        }
        projectViewHolder.mTextStatus.setText(stringStatus);
        projectViewHolder.mTextStatus.setBackgroundResource(statusDrawableResourceId);
    }

    @Override
    public int getItemCount() {
        return mProjects.size();
    }
}
