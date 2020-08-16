package io.gianmillare.notable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NotableAdapter extends RecyclerView.Adapter<NotableAdapter.NoteViewHolder> {
    public static class NoteViewHolder extends RecyclerView.ViewHolder {
        LinearLayout containerView;
        TextView textView;

        NoteViewHolder(View view) {
            super(view);

            containerView = view.findViewById(R.id.notable_row);
            textView = view.findViewById(R.id.notable_row_text);
        }
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notable_row, parent, false);
        return NoteViewHolder(view);
    }
}
