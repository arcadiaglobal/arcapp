package com.alphawallet.app.entity;

import android.content.Context;
import android.text.TextUtils;

public class MediaLinks
{
    // Update these media platform links and ids to target your media groups,
    // then update the MEDIA_TARGET_APPLICATION to match your applicationId
    public static final String MEDIA_TARGET_APPLICATION = "global.arcadia.wallet";
    public static final String AWALLET_TELEGRAM_URL = "https://t.me/arcadiafoundation";
    public static final String AWALLET_DISCORD_URL = null;
    public static final String AWALLET_TWITTER_ID = "twitter://user?user_id=1617739974094340097";
    public static final String AWALLET_FACEBOOK_ID = null;
    public static final String AWALLET_TWITTER_URL = "https://twitter.com/arcadia_global";
    public static final String AWALLET_FACEBOOK_URL = null;
    public static final String AWALLET_LINKEDIN_URL = "https://www.linkedin.com/company/arcadiaglobal/";
    public static final String AWALLET_REDDIT_URL = null;
    public static final String AWALLET_INSTAGRAM_URL = null;
    public static final String AWALLET_BLOG_URL = null;
    public static final String AWALLET_FAQ_URL = "https://dao.arcadia.global/";
    public static final String AWALLET_GITHUB = "https://github.com/arcadiaglobal/wallet/issues";
    public static final String AWALLET_EMAIL1 = "sup";
    public static final String AWALLET_EMAIL2 = "arcadia.global";
    public static final String AWALLET_SUBJECT = "Mantica Android Android Help";

    public static boolean isMediaTargeted(Context context)
    {
        if (!TextUtils.isEmpty(MEDIA_TARGET_APPLICATION))
        {
            return context.getPackageName().equals(MEDIA_TARGET_APPLICATION);
        }
        else
        {
            return false;
        }
    }
}
