package jp.classmethod.android.sample.fragmentpager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import jp.classmethod.android.sample.traditionalcolorviewer.R;

/**
 * �F����\������ Fragment.
 */
public class TraditionalColorFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // �f�[�^���擾
        Bundle bundle = getArguments();
        int page = bundle.getInt("page");
        String color = bundle.getString("color");
        String name = bundle.getString("name");
        String description = bundle.getString("description");

        // View ������
        View layout = inflater.inflate(R.layout.fragment_traditional_color, container, false);
        layout.setBackgroundColor(Color.parseColor(color));
        
        // �F��
        TextView nameView = (TextView) layout.findViewById(R.id.name_view);
        nameView.setText(name);
        // ���� (�F���̗R��)
        TextView textView = (TextView) layout.findViewById(R.id.text_view);
        textView.setText(description);
        // �F�R�[�h
        TextView colorView = (TextView) layout.findViewById(R.id.color_view);
        colorView.setText(color);
        // �y�[�W
        TextView pageView = (TextView) layout.findViewById(R.id.page_view);
        pageView.setText(String.valueOf(page));

        return layout;
    }

}
