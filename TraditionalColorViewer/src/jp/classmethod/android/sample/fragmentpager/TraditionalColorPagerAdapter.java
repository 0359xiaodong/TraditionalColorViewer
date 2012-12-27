package jp.classmethod.android.sample.fragmentpager;

import java.util.ArrayList;
import jp.classmethod.android.sample.traditionalcolorviewer.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.util.SparseArrayCompat;

/**
 * �F���̕\�����Ǘ����� {@link FragmentPagerAdapter}.
 */
public class TraditionalColorPagerAdapter extends FragmentPagerAdapter {

    /** �F��񃊃X�g. */
    private ArrayList<SparseArrayCompat<String>> mList;

    /**
     * �R���X�g���N�^.
     * @param fm {@link FragmentManager}
     */
    public TraditionalColorPagerAdapter(FragmentManager fm) {
        super(fm);
        mList = new ArrayList<SparseArrayCompat<String>>();
    }

    @Override
    public Fragment getItem(int position) {

        // �Ώۃy�[�W�̐F�����擾
        SparseArrayCompat<String> item = mList.get(position);

        // �F���� Bundle �ɂ���
        Bundle bundle = new Bundle();
        bundle.putInt("page", position);
        bundle.putString("color", item.get(0));
        bundle.putString("name", item.get(1));
        bundle.putString("description", item.get(2));

        // Fragment ������ Bundle ���Z�b�g����
        TraditionalColorFragment frag = new TraditionalColorFragment();
        frag.setArguments(bundle);

        return frag;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    /**
     * �F����ǉ�����.
     * @param item �F���
     */
    public void add(SparseArrayCompat<String> item) {
        mList.add(item);
    }

    /**
     * �F�������X�g�Œǉ�����.
     * @param list �F��񃊃X�g
     */
    public void addAll(ArrayList<SparseArrayCompat<String>> list) {
        mList.addAll(list);
    }

}
