package com.example.android.politicalpreparedness.election;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.example.android.politicalpreparedness.network.models.Division;
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
    if (bundle.containsKey("arg_election_id")) {
      int argElectionId;
      argElectionId = bundle.getInt("arg_election_id");
      __result.arguments.put("arg_election_id", argElectionId);
    } else {
      throw new IllegalArgumentException("Required argument \"arg_election_id\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("arg_division")) {
      Division argDivision;
      if (Parcelable.class.isAssignableFrom(Division.class) || Serializable.class.isAssignableFrom(Division.class)) {
        argDivision = (Division) bundle.get("arg_division");
      } else {
        throw new UnsupportedOperationException(Division.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (argDivision == null) {
        throw new IllegalArgumentException("Argument \"arg_division\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("arg_division", argDivision);
    } else {
      throw new IllegalArgumentException("Required argument \"arg_division\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getArgElectionId() {
    return (int) arguments.get("arg_election_id");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Division getArgDivision() {
    return (Division) arguments.get("arg_division");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("arg_election_id")) {
      int argElectionId = (int) arguments.get("arg_election_id");
      __result.putInt("arg_election_id", argElectionId);
    }
    if (arguments.containsKey("arg_division")) {
      Division argDivision = (Division) arguments.get("arg_division");
      if (Parcelable.class.isAssignableFrom(Division.class) || argDivision == null) {
        __result.putParcelable("arg_division", Parcelable.class.cast(argDivision));
      } else if (Serializable.class.isAssignableFrom(Division.class)) {
        __result.putSerializable("arg_division", Serializable.class.cast(argDivision));
      } else {
        throw new UnsupportedOperationException(Division.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
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
    if (arguments.containsKey("arg_election_id") != that.arguments.containsKey("arg_election_id")) {
      return false;
    }
    if (getArgElectionId() != that.getArgElectionId()) {
      return false;
    }
    if (arguments.containsKey("arg_division") != that.arguments.containsKey("arg_division")) {
      return false;
    }
    if (getArgDivision() != null ? !getArgDivision().equals(that.getArgDivision()) : that.getArgDivision() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getArgElectionId();
    result = 31 * result + (getArgDivision() != null ? getArgDivision().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "VoterInfoFragmentArgs{"
        + "argElectionId=" + getArgElectionId()
        + ", argDivision=" + getArgDivision()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(VoterInfoFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int argElectionId, @NonNull Division argDivision) {
      this.arguments.put("arg_election_id", argElectionId);
      if (argDivision == null) {
        throw new IllegalArgumentException("Argument \"arg_division\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("arg_division", argDivision);
    }

    @NonNull
    public VoterInfoFragmentArgs build() {
      VoterInfoFragmentArgs result = new VoterInfoFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setArgElectionId(int argElectionId) {
      this.arguments.put("arg_election_id", argElectionId);
      return this;
    }

    @NonNull
    public Builder setArgDivision(@NonNull Division argDivision) {
      if (argDivision == null) {
        throw new IllegalArgumentException("Argument \"arg_division\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("arg_division", argDivision);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getArgElectionId() {
      return (int) arguments.get("arg_election_id");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Division getArgDivision() {
      return (Division) arguments.get("arg_division");
    }
  }
}
