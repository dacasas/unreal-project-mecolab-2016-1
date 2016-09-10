package com.epicgames.ue4;

import com.YourCompany.MobileAppFirst.OBBDownloaderService;
import com.YourCompany.MobileAppFirst.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

