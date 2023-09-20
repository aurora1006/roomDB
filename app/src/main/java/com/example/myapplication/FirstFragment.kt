package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    private lateinit var mUserViewModel: UserViewModel
    private var userList = emptyList<User>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        binding.buttonFirst.setOnClickListener {
            insertDataToDatabase()
            //findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    private fun insertDataToDatabase() {
        val firstName = "Aurora"
        val lastName = "Sanchez"

        val user = User(0,firstName,lastName)

        mUserViewModel.addUser(user)
        Toast.makeText(requireContext(),"Successfully added!", Toast.LENGTH_LONG).show()

        mUserViewModel.readAllData.observe(this, Observer { users ->
            System.out.println(users);
        })

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}