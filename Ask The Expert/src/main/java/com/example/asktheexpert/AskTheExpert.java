package com.example.asktheexpert;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.ImageView;



        import java.util.ArrayList;
        import java.util.List;

public class AskTheExpert extends AppCompatActivity {


    List<MessageChatModel> messageChatModelList =  new ArrayList<>();
    RecyclerView recyclerView;
    MessageChatAdapter adapter ;

    EditText messageET;
    ImageView sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_the_expert);

        messageET = (EditText)findViewById(R.id.messageET);
        sendBtn = (ImageView) findViewById(R.id.sendBtn);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(AskTheExpert.this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.smoothScrollToPosition(messageChatModelList.size());
        adapter = new MessageChatAdapter(messageChatModelList, AskTheExpert.this );
        recyclerView.setAdapter(adapter);


        sendBtn.setOnClickListener(v -> {
            String msg = messageET.getText().toString();

            MessageChatModel model = new MessageChatModel(
                    msg,
                    "02:30 PM",
                    0
            );
            messageChatModelList.add(model);
            recyclerView.smoothScrollToPosition(messageChatModelList.size());
            adapter.notifyDataSetChanged();
            messageET.setText("");


        });

    }


    public void btn_science(View view) {

    }

    public void btn_stats(View view) {
    }

    public void btn_lang(View view) {
    }

    public void btn_human(View view) {
    }
}
