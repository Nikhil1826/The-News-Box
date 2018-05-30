package com.fasttech.thenewsbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomAdapterChannelsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView listView1;
    ArrayList<Channels> channelsArrayList;
    ChannelsAdapter adapter;

    void initList1(){
        listView1 = (ListView)findViewById(R.id.listchannels);
        Intent rcv = getIntent();
        String name = rcv.getStringExtra("KeyN");
        channelsArrayList = new ArrayList<>();
        switch (name){
            case "India":
                Channels ch1 = new Channels(R.drawable.aajtak,"AajTak","http://aajtak.intoday.in/");
                Channels ch2 = new Channels(R.drawable.abp,"ABP News","http://abpnews.abplive.in/");
                Channels ch3 = new Channels(R.drawable.indiatv,"India TV","http://www.indiatvnews.com/");
                Channels ch4 = new Channels(R.drawable.zeenews,"Zee News","http://zeenews.india.com/");
                Channels ch5 = new Channels(R.drawable.ndtv,"NDTV India","http://www.ndtv.com/");
                Channels ch6 = new Channels(R.drawable.toi,"Times Of India","http://timesofindia.indiatimes.com/");
                Channels ch7 = new Channels(R.drawable.n18,"News 18","http://hindi.news18.com/");
                channelsArrayList.add(ch1);
                channelsArrayList.add(ch2);
                channelsArrayList.add(ch3);
                channelsArrayList.add(ch4);
                channelsArrayList.add(ch5);
                channelsArrayList.add(ch6);
                channelsArrayList.add(ch7);
                break;

            case "America":
                Channels ch8 = new Channels(R.drawable.cnn,"CNN","http://edition.cnn.com/");
                Channels ch9 = new Channels(R.drawable.fox,"Fox News","http://www.foxnews.com/");
                Channels ch10 = new Channels(R.drawable.msnbc,"MSNBC","http://www.msnbc.com/");
                Channels ch11 = new Channels(R.drawable.fst,"Free Speech TV","https://www.freespeech.org/");
                Channels ch12 = new Channels(R.drawable.nmax,"NewsMax","http://www.newsmax.com/");
                channelsArrayList.add(ch8);
                channelsArrayList.add(ch9);
                channelsArrayList.add(ch10);
                channelsArrayList.add(ch11);
                channelsArrayList.add(ch12);
                break;
            case "England":
                Channels ch13 = new Channels(R.drawable.c4,"Channel 4 News","https://www.channel4.com/news/");
                Channels ch14 = new Channels(R.drawable.sky,"Sky News","http://news.sky.com/");
                Channels ch15 = new Channels(R.drawable.itv,"ITV News","http://www.itv.com/news/");
                Channels ch16 = new Channels(R.drawable.euro,"EuroNews","http://www.euronews.com/");
                Channels ch17 = new Channels(R.drawable.arise,"Arise News","http://www.arise.tv/");
                channelsArrayList.add(ch13);
                channelsArrayList.add(ch14);
                channelsArrayList.add(ch15);
                channelsArrayList.add(ch16);
                channelsArrayList.add(ch17);
                break;
            case "Australia":
                Channels ch18 = new Channels(R.drawable.abc,"ABC News","http://www.abc.net.au/news/newschannel/");
                Channels ch19 = new Channels(R.drawable.news,"News.com.au","http://www.news.com.au/");
                Channels ch20 = new Channels(R.drawable.sbs,"SBS News","http://www.sbs.com.au/news/");
                Channels ch21 = new Channels(R.drawable.perth,"Perth Now","http://www.perthnow.com.au/");
                Channels ch22 = new Channels(R.drawable.aus,"9News","http://www.9news.com.au/");
                channelsArrayList.add(ch18);
                channelsArrayList.add(ch19);
                channelsArrayList.add(ch20);
                channelsArrayList.add(ch21);
                channelsArrayList.add(ch22);
                break;
        }
        adapter = new ChannelsAdapter(this,R.layout.list_item,channelsArrayList);
        listView1.setAdapter(adapter);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter_channels);
        initList1();
        listView1.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String url = channelsArrayList.get(i).getUrl();
        String name =  channelsArrayList.get(i).getName();
        Intent intent = new Intent(CustomAdapterChannelsActivity.this,NewsActivity.class);
        intent.putExtra("KeyName",name);
        intent.putExtra("KeyUrl",url);
        startActivity(intent);

    }
}
