package com.nkechinnaji.buggypedia.data.model

/****
 * Singleton to manage filter selections
 */
object DataConfig {
    var universityList = ArrayList<UniversityProfile>()
    var selectedSchool: String? = null
    var selectedSchoolWebsite: String? = null
}