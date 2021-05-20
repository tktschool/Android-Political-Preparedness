package com.example.android.politicalpreparedness.election;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.android.politicalpreparedness.R;
import com.example.android.politicalpreparedness.network.models.Division;
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
      int argElectionId, @NonNull Division argDivision) {
    return new ActionElectionsFragmentToVoterInfoFragment(argElectionId, argDivision);
  }

  public static class ActionElectionsFragmentToVoterInfoFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionElectionsFragmentToVoterInfoFragment(int argElectionId,
        @NonNull Division argDivision) {
      this.arguments.put("arg_election_id", argElectionId);
      if (argDivision == null) {
        throw new IllegalArgumentException("Argument \"arg_division\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("arg_division", argDivision);
    }

    @NonNull
    public ActionElectionsFragmentToVoterInfoFragment setArgElectionId(int argElectionId) {
      this.arguments.put("arg_election_id", argElectionId);
      return this;
    }

    @NonNull
    public ActionElectionsFragmentToVoterInfoFragment setArgDivision(
        @NonNull Division argDivision) {
      if (argDivision == null) {
        throw new IllegalArgumentException("Argument \"arg_division\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("arg_division", argDivision);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_electionsFragment_to_voterInfoFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionElectionsFragmentToVoterInfoFragment that = (ActionElectionsFragmentToVoterInfoFragment) object;
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
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getArgElectionId();
      result = 31 * result + (getArgDivision() != null ? getArgDivision().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionElectionsFragmentToVoterInfoFragment(actionId=" + getActionId() + "){"
          + "argElectionId=" + getArgElectionId()
          + ", argDivision=" + getArgDivision()
          + "}";
    }
  }
}
