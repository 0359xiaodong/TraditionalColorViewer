package jp.classmethod.android.sample.fragmentpager;

import java.util.ArrayList;
import jp.classmethod.android.sample.traditionalcolorviewer.R;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.util.SparseArrayCompat;
import android.support.v4.view.ViewPager;

/**
 * �`���F�̏���\������ {@link FragmentActivity}.
 */
public class TraditionalColorActivity extends FragmentActivity {
    
    /** �F����\������ {@link ViewPager}. */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // ���C�A�E�g������
        setContentView(R.layout.activity_traditional_color);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        
        // PagerAdapter ������
        FragmentManager fm = getSupportFragmentManager();
        TraditionalColorPagerAdapter adapter = new TraditionalColorPagerAdapter(fm);
        adapter.addAll(getColorList());
        
        // ViewPager �ɃZ�b�g����
        mViewPager.setAdapter(adapter);
    }
    
    /**
     * �F��񃊃X�g��Ԃ�.
     * @return �F��񃊃X�g
     */
    private ArrayList<SparseArrayCompat<String>> getColorList() {
        ArrayList<SparseArrayCompat<String>> list = new ArrayList<SparseArrayCompat<String>>();
        
        SparseArrayCompat<String> color1 = new SparseArrayCompat<String>();
        color1.append(0, "#727171");
        color1.append(1, "�ݐF (�ɂт���)");
        color1.append(2, "�������ɗ΂⒃�̐F�������O���C�ɋ߂��F�B");
        SparseArrayCompat<String> color2 = new SparseArrayCompat<String>();
        color2.append(0, "#2792c3");
        color2.append(1, "�| (�͂Ȃ�)");
        color2.append(2, "���̒P����߂̏����ȐF�B��ԓc��Ƃ������B");
        SparseArrayCompat<String> color3 = new SparseArrayCompat<String>();
        color3.append(0, "#917347");
        color3.append(1, "���t�F (�����΂���)");
        color3.append(2, "�����������t�̐F�Ɏ������F�́A����F(�u�������v)�B����t�l�\���F��ƌ������t������B");
        SparseArrayCompat<String> color4 = new SparseArrayCompat<String>();
        color4.append(0, "#3a5b52");
        color4.append(1, "���� (�ނ�����)");
        color4.append(2, "�ʒ��̉H���̐F�Ɍ���悤�ȁA�Â��݂̗΁B����£�Ƃ������B");
        SparseArrayCompat<String> color5 = new SparseArrayCompat<String>();
        color5.append(0, "#f8b500");
        color5.append(1, "�R���F (��܂Ԃ�����)");
        color5.append(2, "�R���̉Ԃ̐F�̂悤�ȁA�Ⴆ���Ԗ��̉��F�B������F��Ƃ������B");
        SparseArrayCompat<String> color6 = new SparseArrayCompat<String>();
        color6.append(0, "#e5abbe");
        color6.append(1, "�Β|�F (������������)");
        color6.append(2, "�i�f�V�R�Ȃ̐A���Z�L�`�N�̉Ԃ̂悤�ȒW���ԐF�B");
        SparseArrayCompat<String> color7 = new SparseArrayCompat<String>();
        color7.append(0, "#e60026");
        color7.append(1, "�g�@ (�����)");
        color7.append(2, "����ɔR���オ�鉊�̐F�B�u�g�@�n���i�����̂��߂ɔ畆���􂯌�������A�g�̘@�̉Ԃ̂悤�ɂȂ�j�v���u�g�̉��̔R�������v�ƌ�F�����̂��R���B");
        SparseArrayCompat<String> color8 = new SparseArrayCompat<String>();
        color8.append(0, "#007b43");
        color8.append(1, "��֐F (�Ƃ��킢��)");
        color8.append(2, "�X�M�Ȃǂ̏�Ύ��̗t�̂悤�Ȃ����񂾗ΐF�B");
        
        list.add(color1);
        list.add(color2);
        list.add(color3);
        list.add(color4);
        list.add(color5);
        list.add(color6);
        list.add(color7);
        list.add(color8);
        
        return list;
    }

}
