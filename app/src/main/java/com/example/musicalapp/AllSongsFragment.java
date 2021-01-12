package com.example.musicalapp;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AllSongsFragment extends Fragment implements SongsInterface{
    RecyclerView recyclerView;
    ArrayList<Songs> songsList = new ArrayList<>();
    public AllSongsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return  inflater.inflate(R.layout.fragment_all_songs, container, false);
        }
        @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
            AdapterSongs adapterSongs =new AdapterSongs(getContext(),songsList,this);
            recyclerView =view.findViewById(R.id.recycler_view);
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
            recyclerView.setAdapter(adapterSongs);
            setSongs();

        }

        public void setSongs() {
            songsList.add(new Songs(R.drawable.amr_diab, getString(R.string.aho_lelil_we_adda), "Amr Diab", R.raw.a2_aho_leli_we_adda, "4.05"));
            songsList.add(new Songs(R.drawable.amr_diab, getString(R.string.kan_kol_haga), "Amr Diab", R.raw.a2_kan_kol_haga, "3.33"));
            songsList.add(new Songs(R.drawable.fayrouz, getString(R.string.al_ayel), "Fayrouz", R.raw.f1_2al_ayel, "4.44"));
            songsList.add(new Songs(R.drawable.fayrouz, getString(R.string.f2_ossa_zghire_ktir), "Fayrouz", R.raw.f2_ossa_zghire_ktir, "4.40"));
            songsList.add(new Songs(R.drawable.fayrouz, getString(R.string.f3_al_bostah), "Fayrouz", R.raw.f3_al_bostah, "8.57"));
            songsList.add(new Songs(R.drawable.hesham_kharma, getString(R.string.h0_helwa_belady_el_samra), "Hesham Kharma", R.raw.h0_helwa_belady_el_samra, "2.56"));
            songsList.add(new Songs(R.drawable.hussain_al_gasmy, getString(R.string.h1_sonnet_el_haya), "Hussain Al_Ggasmy", R.raw.h1_sonnet_el_haya, "2.26"));
            songsList.add(new Songs(R.drawable.hussain_al_gasmy, getString(R.string.h2_bel_bont_el_3reed), "Hussain Al_Ggasmy", R.raw.h2_bel_bont_el_3reed, "3.22"));
            songsList.add(new Songs(R.drawable.mohamed_munir, getString(R.string.m1_albi_maishbhnesh), "Mohamed Munir", R.raw.m1_albi_maishbhnesh, "3.47"));
            songsList.add(new Songs(R.drawable.mohamed_munir, getString(R.string.m2_efta7o_ya_hamam), "Mohamed Munir", R.raw.m2_efta7o_ya_hamam, "3.54"));
            songsList.add(new Songs(R.drawable.mohamed_munir, getString(R.string.m3_kol_el_mafrood), "Mohamed Munir", R.raw.m3_kol_el_mafrood, "2.57"));
            songsList.add(new Songs(R.drawable.nancy_ajram, getString(R.string.n1__albi_ya_albi), "Nancy Ajram", R.raw.n1__albi_ya_albi, "4.29"));
        }
    @Override
    public void SetData(Songs song) {
        if (getActivity()instanceof MainActivity)
        ((MainActivity)getActivity()).playSong(song);
    }

}