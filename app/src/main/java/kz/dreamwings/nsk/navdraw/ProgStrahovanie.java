package kz.dreamwings.nsk.navdraw;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dreamwings.azamat.navdraw.R;

import java.util.ArrayList;
import java.util.List;

public class ProgStrahovanie extends AppCompatActivity {

    private List<String> pictures = new ArrayList<String>();
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_item_prog_strahovanie1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        TextView image_name = (TextView) findViewById(R.id.img_name);
        TextView description = (TextView) findViewById(R.id.description);
        ViewPager viewpager = (ViewPager) findViewById(R.id.viewpager);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        TextView cost = (TextView) findViewById(R.id.cost);
        Button calk = (Button) findViewById(R.id.calk);
        calk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProgStrahovanie.this,Calkulator_Avto.class);
                startActivity(intent);

            }
        });

        if (getIntent().getExtras().getInt("ID")==0)
        {
            getSupportActionBar().setTitle("Каско");
            pictures.add("http://nsk.kz/download/images/1_3.jpg");
            pictures.add("http://nsk.kz/download/images/2_4.jpg");
            pictures.add("http://storage.megasos.com/uploads/media/images/articles/559b7f797ffda.jpeg");
            pictures.add("http://avtomotospec.ru/wp-content/uploads/2013/01/strahovanie-avtomobilj-dlj-remonta.jpg");
            pictures.add("http://aoestrahovanie.ru/wp-content/uploads/2015/10/oformit-kasko-na-avtomobil-v-moskve-onlajn.jpg");
            image_name.setText("Добровольное страхование автотранспортных средств");
            cost.setText("10 000 тг");
            description.setText(Html.fromHtml(getString(R.string.kasko)));

        }

        if (getIntent().getExtras().getInt("ID")==1)
        {
            getSupportActionBar().setTitle("ОС ГПО автовладельцев");
            pictures.add("http://nsk.kz/download/images/5_1.jpg");
            pictures.add("http://nsk.idhost.kz/images1/big4.jpg");
            pictures.add("http://nsk.kz/download/images/6_1.jpg");
            image_name.setText("Страхование гражданско-правовой ответственности автовладельца (ОС ГПО ВТС)");
            cost.setText("15 000 тг");
            description.setText(Html.fromHtml(getString(R.string.avto)));

        }

        if (getIntent().getExtras().getInt("ID")==2)
        {
            getSupportActionBar().setTitle("ОС ГПО перевозчика");
            pictures.add("http://nsk.kz/download/images/os-gpo-perevozchika.jpg");
            pictures.add("http://nsk.idhost.kz/images3/27.jpg");
            pictures.add("http://upload.akusherstvo.ru/image784738.png");
            image_name.setText("Обязательное страхование гражданско-правовой ответственности перевозчика перед пассажирами");
            cost.setText("12 000 тг");
            description.setText(Html.fromHtml(getString(R.string.perevoz)));

        }

        if (getIntent().getExtras().getInt("ID")==3)
        {
            getSupportActionBar().setTitle("Страхование имущества – классическое");
            pictures.add("http://nsk.kz/download/images/1_4.jpg");
            pictures.add("http://polisre.kz/uploads/posts/2011-07/1310725147_straxovanie-imushhestva.jpg");
            pictures.add("http://centr-polis.ru/wp-content/uploads/2014/03/strahovanie-imushestva.jpg");
            image_name.setText("Страхование имущества");
            cost.setText("100 000 тг");
            description.setText(Html.fromHtml(getString(R.string.im_klass)));

        }

        if (getIntent().getExtras().getInt("ID")==4)
        {
            getSupportActionBar().setTitle("Страхование имущества – экспресс");
            pictures.add("http://strahovanietut.ru/wp-content/uploads/2014/11/%D0%A2%D0%B8%D1%82%D1%83%D0%BB%D1%8C%D0%BD%D0%BE%D0%B5-%D1%81%D1%82%D1%80%D0%B0%D1%85%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5-%D0%BA%D0%B2%D0%B0%D1%80%D1%82%D0%B8%D1%80%D1%8B-%D0%B2-%D0%B8%D0%BF%D0%BE%D1%82%D0%B5%D0%BA%D0%B5.jpg");
            pictures.add("http://antines.ru/wp-content/uploads/2014/03/1339320153_titulnoe-strahovanie.jpg");
            pictures.add("http://finiq.ru/uploads/20140820130100_ae445_1280x1280.jpg");
            cost.setText("150 000 тг");
            image_name.setText("Программа «Экспресс страхование имущества» предусмотрена только для страхования КВАРТИР");
            description.setText(Html.fromHtml(getString(R.string.im_express)));

        }

        if (getIntent().getExtras().getInt("ID")==5)
        {
            getSupportActionBar().setTitle("Медицинское страхование для компаний");
            pictures.add("http://nsk.kz/download/images/4_2.jpg");
            pictures.add("http://www.eurolab.ua/img/news/01_2013/world_helth.jpg");
            pictures.add("http://www.safety-kasko.ru/img/sotrudniki/%D1%81%D1%82%D1%80%D0%B0%D1%85%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%20%D1%81%D0%BE%D1%82%D1%80%D1%83%D0%B4%D0%BD%D0%B8%D0%BA%D0%BE%D0%B22.jpg");
            cost.setText("170 000 тг");
            image_name.setText("Медицинское страхование для компаний");
            description.setText(Html.fromHtml(getString(R.string.med_com)));

        }

        if (getIntent().getExtras().getInt("ID")==6)
        {
            getSupportActionBar().setTitle("Медицинское страхование для частных лиц");
            pictures.add("http://nsk.kz/download/images/medicinskoe-strahovanie-dlya-chastnyh-lic.jpg");
            pictures.add("http://www.dalgaso.ru/sites/default/files/5.jpg");
            pictures.add("http://kaztv.kaztrk.kz/images/news/5d8da1043f8ed8c967e12f318e2cabbc.jpg");
            cost.setText("12 000 тг");
            image_name.setText("Медицинское страхование для частных лиц");

            description.setText(Html.fromHtml(getString(R.string.med_ur)));

        }

        if (getIntent().getExtras().getInt("ID")==7)
        {
            getSupportActionBar().setTitle("Страхование путешественников");
            pictures.add("http://nsk.kz/download/images/2_3.jpg");
            pictures.add("http://travel24.az/codes/_files/backgroundImage.png");
            pictures.add("http://suomik.com/images/stories/strahovanie_turistov_1.jpg");
            image_name.setText("Страхование лиц, выезжающих за рубеж");
            cost.setText("22 000 тг");
            description.setText(Html.fromHtml(getString(R.string.put)));

        }

        viewpager.setAdapter(new DemoPagerAdapter(pictures));
        indicator.setViewPager(viewpager);
        viewpager.setCurrentItem(0);


        /* FAB */

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "+77072706854"));
                startActivity(intent);
            }
        });
    }

}
