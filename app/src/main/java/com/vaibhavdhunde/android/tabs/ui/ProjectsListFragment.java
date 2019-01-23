package com.vaibhavdhunde.android.tabs.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.vaibhavdhunde.android.tabs.R;
import com.vaibhavdhunde.android.tabs.adapter.ProjectAdapter;
import com.vaibhavdhunde.android.tabs.data.ProjectsData;
import com.vaibhavdhunde.android.tabs.model.Project;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class ProjectsListFragment extends Fragment {

    @BindView(R.id.projects_recycler_view)
    RecyclerView mListProjects;

    private ProjectAdapter mProjectAdapter;

    private Context mContext;

    public ProjectsListFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_projects_list, container, false);
        ButterKnife.bind(this, rootView);

        mContext = getContext();

        setupListProjects();

        mProjectAdapter = new ProjectAdapter(getProjects());
        mListProjects.setAdapter(mProjectAdapter);

        return rootView;
    }

    private List<Project> getProjects() {
        List<Project> projects = new ArrayList<>();

        for (int i = 0; i < ProjectsData.getCount(); i++) {
            projects.add(new Project(
                    ProjectsData.getTitles().get(i),
                    ProjectsData.getDescription(),
                    ProjectsData.getStatuses().get(i))
            );
        }

        return projects;
    }

    private void setupListProjects() {
        mListProjects.setHasFixedSize(true);
        LayoutManager layoutManager = new LinearLayoutManager(mContext);
        mListProjects.setLayoutManager(layoutManager);
        mListProjects.addItemDecoration(new DividerItemDecoration(mContext, LinearLayout.VERTICAL));
    }
}
