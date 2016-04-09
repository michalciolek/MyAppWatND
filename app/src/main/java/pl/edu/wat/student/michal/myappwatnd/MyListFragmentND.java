package pl.edu.wat.student.michal.myappwatnd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import pl.edu.wat.student.michal.myappnd.R;

/**
 * Created by Michał on 2016-04-09.
 */
public class MyListFragmentND extends ListFragment {

    String[] list = { "Strona główna", "Informacje" };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListAdapter myListAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, list);
        setListAdapter(myListAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_list_fragment, container, false);
    }


    public void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub

        Intent intent;
        switch (position) {
            case 0:
                intent = new Intent(getContext(), WelcomeActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                this.startActivity(intent);
                break;
            case 1:
                intent = new Intent(getContext(), Main2Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                this.startActivity(intent);
                break;
        }
    }
}