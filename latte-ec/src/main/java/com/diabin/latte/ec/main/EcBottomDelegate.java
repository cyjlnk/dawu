package com.diabin.latte.ec.main;

import android.graphics.Color;

import com.diabin.latte.delegates.bottom.BaseBottomDelegate;
import com.diabin.latte.delegates.bottom.BottomItemDelegate;
import com.diabin.latte.delegates.bottom.BottomTabBean;
import com.diabin.latte.delegates.bottom.ItemBuilder;
import com.diabin.latte.ec.main.cart.ShopCartDelegate;
import com.diabin.latte.ec.main.discover.DiscoverDelegate;
import com.diabin.latte.ec.main.index.IndexDelegate;
import com.diabin.latte.ec.main.personal.PersonalDelegate;
import com.diabin.latte.ec.main.sort.SortDelegate;

import java.util.LinkedHashMap;

/**
 * Created by fei on 2017/8/2.
 */

public class EcBottomDelegate extends BaseBottomDelegate {
    @Override
    public LinkedHashMap<BottomTabBean, BottomItemDelegate> setItems(ItemBuilder builder) {

        final LinkedHashMap<BottomTabBean, BottomItemDelegate> items=new LinkedHashMap<>();

        items.put(new BottomTabBean("{fa-home}","首页"),new IndexDelegate());
        items.put(new BottomTabBean("{fa-google}","科研"),new IndexDelegate());
        items.put(new BottomTabBean("{fa-compass}","教学"),new IndexDelegate());
        items.put(new BottomTabBean("{fa-sort}","管理"),new ShopCartDelegate());

        items.put(new BottomTabBean("{fa-search}","热物性"),new SortDelegate());
        items.put(new BottomTabBean("{fa-wordpress}","博客"),new DiscoverDelegate());
        items.put(new BottomTabBean("{fa-user}","我的"),new PersonalDelegate());

        return builder.addItems(items).build();
    }

    @Override
    public int setIndexDelegate() {
        return 0;
    }

    @Override
    public int setClickedColor() {
        return Color.parseColor("#ffff8800");
    }
}
