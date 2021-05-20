package com.example.android.politicalpreparedness.launch;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.android.politicalpreparedness.R;

public class LaunchFragmentDirections {
  private LaunchFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLaunchFragmentToRepresentativeFragment() {
    return new ActionOnlyNavDirections(R.id.action_launchFragment_to_representativeFragment);
  }

  @NonNull
  public static NavDirections actionLaunchFragmentToElectionsFragment() {
    return new ActionOnlyNavDirections(R.id.action_launchFragment_to_electionsFragment);
  }
}
