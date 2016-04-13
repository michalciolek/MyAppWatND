package pl.edu.wat.student.michal.myappwatnd;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import pl.edu.wat.student.michal.myappnd.R;

/**
 * Created by Michał on 2016-04-09.
 */
public class MyListFragment extends ListFragment implements AdapterView.OnItemClickListener {
    //TODO: zamienić ListView na RecyclerView
    //http://developer.android.com/training/material/lists-cards.html
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_list_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Informations, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(), "Position: " + position + " of array was clicked", Toast.LENGTH_SHORT).show();
    }
}