package com.example.android.politicalpreparedness.election;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.android.politicalpreparedness.R;
import com.example.android.politicalpreparedness.network.models.Election;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ElectionsFragmentDirections {
  private ElectionsFragmentDirections() {
  }

  @NonNull
  public static ActionElectionsFragmentToVoterInfoFragment actionElectionsFragmentToVoterInfoFragment(
      @NonNull Election argElection) {
    return new ActionElectionsFragmentToVoterInfoFragment(argElection);
  }

  public static class ActionElectionsFragmentToVoterInfoFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionElectionsFragmentToVoterInfoFragment(@NonNull Election argElection) {
      if (argElection == null) {
        throw new IllegalArgumentException("Argument \"arg_election\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("arg_election", argElection);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionElectionsFragmentToVoterInfoFragment setArgElection(
        @NonNull Election argElection) {
      if (argElection == null) {
        throw new IllegalArgumentException("Argument \"arg_election\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("arg_election", argElection);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_electionsFragment_to_voterInfoFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Election getArgElection() {
      return (Election) arguments.get("arg_election");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionElectionsFragmentToVoterInfoFragment that = (ActionElectionsFragmentToVoterInfoFragment) object;
      if (arguments.containsKey("arg_election") != that.arguments.containsKey("arg_election")) {
        return false;
      }
      if (getArgElection() != null ? !getArgElection().equals(that.getArgElection()) : that.getArgElection() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getArgElection() != null ? getArgElection().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionElectionsFragmentToVoterInfoFragment(actionId=" + getActionId() + "){"
          + "argElection=" + getArgElection()
          + "}";
    }
  }
}
