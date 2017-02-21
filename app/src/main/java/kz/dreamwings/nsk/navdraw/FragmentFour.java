package kz.dreamwings.nsk.navdraw;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.dreamwings.azamat.navdraw.R;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentFour.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentFour#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentFour extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public static final String TITLE = "title";
    public static final String DESCRIPTION = "des";
    public static final String TIME = "time";
    public static final String IMG_URL = "img_url";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    ArrayList<HashMap<String,String>> data =  new ArrayList<HashMap<String, String>>();

    public FragmentFour() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentOne.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentFour newInstance(String param1, String param2) {
        FragmentFour fragment = new FragmentFour();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_four, container, false);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Пресс центр");

        HashMap<String, String> hm1 = new HashMap<String, String>();
        hm1.put(TITLE, "25 сентября 2009 года в АО \"НСК\" была создана Агентская сеть");
        hm1.put(DESCRIPTION, "Ее создание стало естественной необходимостью в части улучшения качества обслуживания наших Клиентов.");
        hm1.put(TIME, "14.03.2016");
        hm1.put(IMG_URL, "http://nsk.kz/imagine/news_icon/5-let-agentskoi-seti.jpg");

        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm2.put(TITLE,"Х Ежегодный Чемпионат по мини-футболу ЕВРОБАК");
        hm2.put(DESCRIPTION," 13 сентября состоялся Х Ежегодный Чемпионат по мини-футболу ЕВРОБАК. Приняли участие 16 команд из них 4 - представители страховых компаний.");
        hm2.put(TIME, "11.03.2016");
        hm2.put(IMG_URL, "http://nsk.kz/imagine/news_icon/futbol.jpg");

        HashMap<String, String> hm3 = new HashMap<String, String>();
        hm3.put(TITLE,"«Эксперт РА Казахстан» подтвердил рейтинг надежности АО «Нефтяная страховая компания» на уровне А+");
        hm3.put(DESCRIPTION," Рейтинговое агентство «Эксперт РА Казахстан» подтвердил рейтинг надежности \n" +
                "АО «Нефтяная страховая компания» на уровне A+ «Очень высокий уровень надежности».");
        hm3.put(TIME, "08.03.2016");
        hm3.put(IMG_URL, "http://www.insurancejournal.com/wp-content/uploads/2014/01/Grade1-580x580.jpg");

        HashMap<String, String> hm4 = new HashMap<String, String>();
        hm4.put(TITLE,"НСК выплатила более 1,6 млрд. тенге за 6 мес. 2014 года");
        hm4.put(DESCRIPTION,"  По итогам шести месяцев 2014 года АО «НСК» выплатила своим клиентам 1,68 млрд. тенге в виде страховых выплат. Компания заняла первое место по размеру выплат в страховании грузов и авиаКАСКО.");
        hm4.put(TIME, "02.03.2016");
        hm4.put(IMG_URL, "http://www.economonitor.com/wp-content/uploads/2015/10/6355318323_4c41d3ef76_z.jpg");

        HashMap<String, String> hm5 = new HashMap<String, String>();
        hm5.put(TITLE, "«НСК» застраховала футбольный клуб «Астана» на 375 млн. тенге");
        hm5.put(DESCRIPTION, " Cтраховой защитой обеспечены 98 человек: футболисты (игроки основного состава, запасные), тренерский состав, администрация клуба, технические специалисты.");
        hm5.put(TIME, "22.02.2016");
        hm5.put(IMG_URL, "http://nsk.kz/download/images/d184d183d182d0b1d0bed0bbd18cd0bdd0b0d18f20d0bad0bed0bcd0b0d0bdd0b4d0b020d090d181d182d0b0d0bdd0b0_2014.jpg");

        data.add(hm1);
        data.add(hm2);
        data.add(hm3);
        data.add(hm4);
        data.add(hm5);

        NewsAdapter adapter = new NewsAdapter(getActivity(),data);

        ListView lvNews = (ListView) view.findViewById(R.id.lvNews);
        lvNews.setAdapter(adapter);
        lvNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent appNews = new Intent(getActivity(), News.class);
                appNews.putExtra("ID", position);
                startActivity(appNews);
            }
        });


        return view;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
