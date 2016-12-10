/*Copyright 2016 Karunakaran.G Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License. You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

package com.ezhil.handbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ezhil.handbook.R;

public class EzhilExamples_Examples extends AppCompatActivity {
    String[] listitems={"குறிசொற்க்கள்(keywords)",
            "ஒருமசெயற்குறி(unary operator)",
            "கூட்டு",
            "நிரல் இயக்கி(execution)",
            "பதித்தல்(print)",
            "பெர்னெளலி எண்(bernoulli number)",
            "பைனாமியல் குணகம்(binomial coefficient)",
            "அறுபதின்மம்(hexadecimal)",
            "குப்பை உள்ளே,வெளியே(garbage I/O)",
            "பட்டியலில் செயல்பாடு",
            "சரியான மாறி அறிவிப்பு(good lexeme)",
            "தவறான மாறி அறிவிப்பு(bad lexeme)",
            "வணக்கம் உலகம்",
            "தொடர்பெருக்கு(factorial)",
            "எல்லை (ம) நீளம்(range and length)",
            "மீப்பெரு பொது வகுத்தி(GCD)",
            "வரை குறிசொல்(while)",
            "வணக்கம்",
            "ஆலயம்",
            "சொல் சரிபார்த்தல்",
            "ஆனால் குறிசொல்(if)",
            "வரைதல்(Drawing)",
            "சரங்கள்(strings)",
            "வாய்ப்படு",
            "கணிப்பான்(calculator)",
            "பட்டியல்",
            "சரம் எ.கா",
            "பட்டியல் எ.கா",
            "யிங்யாங் சின்னம்(yinyang)",
            "ஒருமசெயற்குறி(unary operator)",
            "பூலியன்(boolean)",
            "குழப்பமான வரிகள்(chaos)",
            "பகா எண்(prime numbers)",
            "அணி 1(array)",
            "அணி 2",
            "கோப்புகள் உருவக்க(create file)",
            "கொப்புகள் திறக்க,படிக்க",
            "தலைகீழ்(reverse)",
            "நன்பர்கள்",
            "இருவழியொக்கும் வார்த்தைகள்(palindromes)",
            "ஆக வளையம்",
            "மாதிரி உள்ளீடுகள்",
            "ஆக குறிசொல்",
            "வளையம்(loops)",
            "ஒவொன்றாக 1(for each loop)",
            "ஒவ்வொன்றக 2",
            "செய் முடியெனில்",
            "தேர்வுகள்",
            "மாய நாணயங்கள்",
            "ஏழை,பணக்காரர்",
            "கடலை மிட்டாய்",
            "ஏரண செயல்பாடு NOT(logical not)",
            "இருமஎண்கள்(binary)",
            "பிபொனாச்சி தொடர்(fibonacci series)",
            "தசமஎண்",
            "ஆனால் குறிசொல்",
                "ஹெயில்ஸ்டோன் தொடர்(Heilstone series)",
                "எழுத்தை பிரித்தெடுத்தல்(split text)",
                "மீசிம, மீபொவ (LCM and GCD)",
                "தொடர்பெருக்கு(factorial)",
                "கெல்வினுக்கு மாற்றுதல்(convert to kelvin)",
                "வை குறிசொல்",
                "ஒளியின் வேகம்",
                "டிக் டாக்",
                "சில்லரை கொடுதல்",
                "பின்கொடு(return)",
                "வெற்று பட்டியல்",
                "பயனிலை",
                "S-வெளிப்பாடு(S-expression)",
                "சாவியும் மதிப்பும்(key and value)",
                "பழங்கள்",
                "விருப்ப",
                "சரங்களை சேர்த்தல்",
                "ஆம்ஸ்ட்ராங் எண்(armstrong number)",
                "அணி 1",
                "அணி 2",
                "தமிழ் எழுத்துக்கள்",
                "தமிழ் மாதங்கள்",
                "ஹோனாய் கோபுரம்(tower of hanoi)",
                "ஹோனாய்",
                "பெரிய எண்",
                "இரண்டின் அடுக்குகள்(powers of two)",
                "எண்களின் கூட்டுத்தொகை",
                "உடல் பருமன் சுட்டு(BMI)",
                "சமமா",
                "மங்கள்யான்",
                "பூலியன்",
                "பொதுவான மாறி(global variable)",
                "தமிழ் 1",
                "தமிழ் 2",
                "தமிழ் வார்தைகள்",
                "பட்டியலில் சரங்கள்",
                "அணியில் எழுதுதல்",
                "கண்டுபிடி",
                "கணித ஏறுவரிசை",
                "முக்கோணவியல் ஏறுவரிசை",
                "ஹார்மோனிக் தொடர்(harmonic series)",
                "கணிதம்-complex",
                "கணிதம்-பொண் விகிதம்(Golden ratio)",
                "கணிதம்-ஹார்னர் வழி(Horner method)",
                "பட்டியல்",
                "கணிதம் வழிமுறை சரிபார்த்தல்",
                "பீர் பாட்டில் பாடல்",
                "வகைபடுத்துதல்",
                "பிட் குறியீடு(bit)",
                "மதிப்பீடு",
                "மாடி விளக்கு பொத்தான்கள்(staircase light)",
                "பூலியன் செயல்பாடுகள்(boolean functions)",
                "பூலியன் டீமார்கன்(boolean,Demorgon)",
                "அரைகூட்டி(half adder)",
                "முழுகூட்டி(full adder)",
                "மதிபீடு 1",
                "மதிப்பீடு 2",
                "வார்தை வகைபடுத்துதல்(sorting)",
                "நியூரான்கள்(neurons)",
                "வரவு செலவு",
                "கணிப்பான்(calculator)",
                "மாறி(variable)",
                "பைத்தான்(python)",
                "ஆனால் குறிசொல்",
                "மார்ஸ் குறியீடு",
                "பகுதி மதிப்பீடு(partition estimate)",
                "சூழ்நிலை மாறி சரிபார்த்தல்(checking environment variables)",
                "இல்லை ஆனால்",
                "கூட்டல்",
                "URL உதாரணம்",
                "ஒவ்வொன்றக",
                "மூளை குழப்பி(Brain F**k)",
                "சீசர் குறியீடு(caesar)",
                "குறியாக்கம்(encoding)",
                "piglatin குறியாக்கம்",
                "json உதாரணம்"};
    String[] items={
            "keyword_notes.n",
            "unop.n",
            "koottu.n",
            "executev1.n",
            "hola.n",
            "bernoulli_number.n",
            "bincoeff.n",
            "hexadecimal.n",
            "gigo.n",
            "lisp0.n",
            "oklex.n",
            "badlex.n",
            "hello.n",
            "fact.n",
            "ranges.n",
            "gcd.n",
            "printtest.n",
            "vannakm.n",
            "temple.n",
            "lex2.n",
            "ifchain.n",
            "fern.n",
            "strings.n",
            "tables.n",
            "calc_asmd.n",
            "list.n",
            "string_demo.n",
            "list_ta.n",
            "yinyang.n",
            "unaryop.n",
            "boolean.n",
            "chaos.n",
            "prime.n",
            "array1.n",
            "array2.n",
            "filedemo.n",
            "filerw.n",
            "reverse.n",
            "friends.n",
            "palindromes.n",
            "ford2.n",
            "trials.n",
            "fornested.n",
            "loopupdate.n",
            "foreach.n",
            "foriter.n",
            "dowhile.n",
            "select_case2.n",
            "magic_coins.n",
            "rich_poor.n",
            "peanut_candy.n",
            "logical_not.n",
            "binary.n",
            "fibo.n",
            "floatpthole.n",
            "ifnested.n",
            "hailstone.n",
            "split_text.n",
            "lcmgcd.n",
            "windoze.n",
            "convert2kelvin.n",
            "dict.n",
            "speedoflight.n",
            "tictok.n",
            "change.n",
            "solo_return.n",
            "listmt.n",
            "predicates.n",
            "sexpr.n",
            "dict_ta.n",
            "fruity.n",
            "optional.n",
            "sine_qua_non.n",
            "armstrong.n",
            "array0.n",
            "array_nd.n",
            "tamil_letters.n",
            "tamil_months.n",
            "tower_of_hanoi.n",
            "hanoi.n",
            "max_wo_compare.n",
            "powers_of_two.n",
            "sum_of_digits.n",
            "bmi.n",
            "isbalanced.n",
            "mangalyaan.n",
            "boolf.n",
            "globalvars.n",
            "tamil1.n",
            "tamil2.n",
            "tamil_tha.n",
            "ta_strings.n",
            "array_wr.n",
            "find.n",
            "math_arithprogression.n",
            "math_geomprogression.n",
            "math_harmonicseries.n",
            "math_complex.n",
            "math_goldenratio.n",
            "math_horner.n",
            "dict_rw.n",
            "ml.n",
            "beer_bottles_song.n",
            "sort.n",
            "bitwiseops.n",
            "mathipeedu.n",
            "staircase_light.n",
            "boolean_fcns.n",
            "boolean_demorgan.n",
            "half_adder.n",
            "full_adder.n",
            "eval0.n",
            "eval1.n",
            "ta_sort.n",
            "neuron.n",
            "varavu_selavu.n",
            "calc2.n",
            "name_var.n",
            "py1.n",
            "demoif.n",
            "morse.n",
            "partition_estimate.n",
            "envchecks.n",
            "ifparse.n",
            "foo.n",
            "urldemo.n",
            "douglasfir.n",
            "bf0.n",
            "caesar.n",
            "rot13.n",
            "piglatin.n",
            "json_demo.n"
    };
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ezhilexamples_examples);
        ListView list=(ListView)findViewById(R.id.listview52);
        CustomArrayAdapter adapter= new CustomArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,items);
        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,listitems);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(EzhilExamples_Examples.this,Loadexamplehtml.class);
                intent.putExtra("file",items[position]);
                startActivity(intent);
            }
        });
    }
}
