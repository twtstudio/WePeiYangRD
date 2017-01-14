package com.twtstudio.retrox.wepeiyangrd.home.user;

import android.content.Context;
import android.databinding.ObservableField;

import com.kelin.mvvmlight.base.ViewModel;
import com.kelin.mvvmlight.command.ReplyCommand;

/**
 * Created by retrox on 2017/1/14.
 */

public class AvatarItemViewModel implements ViewModel {

    private Context mContext;

    //field
    public final ObservableField<String> avatarUrl = new ObservableField<>();
    public final ObservableField<String> userName = new ObservableField<>();
    public final ObservableField<String> intro = new ObservableField<>("这个人很懒没有写简介");

    public final ReplyCommand onEditClick = new ReplyCommand(this::editIntro);

    private void editIntro(){
        // TODO: 2017/1/14 jump to edit intro activity
    }

    public AvatarItemViewModel() {
        //avatarUrl.set();
    }
}