package com.knock.ashu.aicteandroid;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.knock.ashu.aicteandroid.fragments.AboutUsFragment;
import com.knock.ashu.aicteandroid.fragments.BulletinFragment;
import com.knock.ashu.aicteandroid.fragments.BureausFragment;
import com.knock.ashu.aicteandroid.fragments.EducationFragment;
import com.knock.ashu.aicteandroid.fragments.GrievanceFragment;
import com.knock.ashu.aicteandroid.fragments.ReadBlogsFragment;
import com.knock.ashu.aicteandroid.fragments.ReportsFragment;
import com.knock.ashu.aicteandroid.fragments.StatisticsFragment;
import com.knock.ashu.aicteandroid.fragments.StudentsFragment;

/**
 * Created by Ashu on 1/3/2017.
 */

public class FullInfoActivity extends SingleFragmentActivity {

    public static int mPosition;

    @Override
    protected Fragment createFragment() {
        if (mPosition == 0) {
            return AboutUsFragment.newInstance();
        } else if (mPosition == 1) {
            return BureausFragment.newInstance();
        } else if (mPosition == 2) {
            return GrievanceFragment.newInstance();
        } else if (mPosition == 3) {
            return ReportsFragment.newInstance();
        } else if (mPosition == 4) {
            return StatisticsFragment.newInstance();
        } else if (mPosition == 5) {
            return EducationFragment.newInstance();
        } else if (mPosition == 6) {
            return StudentsFragment.newInstance();
        } else if (mPosition == 7) {
            return BulletinFragment.newInstance();
        } else if (mPosition == 8) {
            return ReadBlogsFragment.newInstance();
        }
        Toast.makeText(this, "ITS NULL", Toast.LENGTH_SHORT).show();
        return null;
    }

    public static Intent newIntent(Context context, int position) {
        mPosition = position;
        return new Intent(context, FullInfoActivity.class);
    }
}
