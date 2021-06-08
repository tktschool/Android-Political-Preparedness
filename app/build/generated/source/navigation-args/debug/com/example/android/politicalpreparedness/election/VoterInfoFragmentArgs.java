package com.example.android.politicalpreparedness.election;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.example.android.politicalpreparedness.network.models.Election;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class VoterInfoFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private VoterInfoFragmentArgs() {
  }

  private VoterInfoFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static VoterInfoFragmentArgs fromBundle(@NonNull Bundle bundle) {
    VoterInfoFragmentArgs __result = new VoterInfoFragmentArgs();
    bundle.setClassLoader(VoterInfoFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("arg_election")) {
      Election argElection;
      if (Parcelable.class.isAssignableFrom(Election.class) || Serializable.class.isAssignableFrom(Election.class)) {
        argElection = (Election) bundle.get("arg_election");
      } else {
        throw new UnsupportedOperationException(Election.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (argElection == null) {
        throw new IllegalArgumentException("Argument \"arg_election\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("arg_election", argElection);
    } else {
      throw new IllegalArgumentException("Required argument \"arg_election\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Election getArgElection() {
    return (Election) arguments.get("arg_election");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("arg_election")) {
      Election argElection = (Election) arguments.get("arg_election");
      if (Parcelable.class.isAssignableFrom(Election.class) || argElection == null) {
        __result.putParcelable("arg_election", Parcelable.class.cast(argElection));
      } else if (Serializable.class.isAssignableFrom(Election.class)) {
        __result.putSerializable("arg_election", Serializable.class.cast(argElection));
      } else {
        throw new UnsupportedOperationException(Election.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    VoterInfoFragmentArgs that = (VoterInfoFragmentArgs) object;
    if (arguments.containsKey("arg_election") != that.arguments.containsKey("arg_election")) {
      return false;
    }
    if (getArgElection() != null ? !getArgElection().equals(that.getArgElection()) : that.getArgElection() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getArgElection() != null ? getArgElection().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "VoterInfoFragmentArgs{"
        + "argElection=" + getArgElection()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(VoterInfoFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Election argElection) {
      if (argElection == null) {
        throw new IllegalArgumentException("Argument \"arg_election\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("arg_election", argElection);
    }

    @NonNull
    public VoterInfoFragmentArgs build() {
      VoterInfoFragmentArgs result = new VoterInfoFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setArgElection(@NonNull Election argElection) {
      if (argElection == null) {
        throw new IllegalArgumentException("Argument \"arg_election\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("arg_election", argElection);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Election getArgElection() {
      return (Election) arguments.get("arg_election");
    }
  }
}
